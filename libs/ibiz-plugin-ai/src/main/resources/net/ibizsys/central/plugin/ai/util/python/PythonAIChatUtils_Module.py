import sys
import types
from typing import Union, Any, Literal, Optional, Dict, List
from json_repair import repair_json
import requests
import json
import re

aichat_utils = types.ModuleType('aichat_utils')
sys.modules['aichat_utils'] = aichat_utils


class InternalRequest:
    def __init__(self):
        self.base_url = "http://127.0.0.1:28186/local/ai/sessions"
        self.session_id = ""
        self.full_url = ""

    def set_env(self, session_id: str, base_url: str = None) -> None:
        """
        设置环境变量。

        参数:
            env: 环境变量字典。
        """
        # 判断 base_url 不为 None 也不为null

        if base_url is not None and base_url != "":
            self.base_url = base_url
        self.session_id = session_id
        self.full_url = f"{self.base_url}/{self.session_id}"

    def post(self, util: str, method: dict, **kwargs) -> Any:
        url = f"{self.full_url}/{util}/{method}"
        rep = requests.post(url, json=kwargs)
        if rep.status_code == 200:
            return rep.text
        else:
            raise RuntimeError(f"内部请求失败: {rep.status_code}，{rep.text}")


# try:
#     # 使用 globals() 获取，如果不存在则报错提示更清晰
#     srf_agent = globals()['srf_agent']
#     srf_session = globals()['srf_session']
#     srf_system_out = globals()['srf_system_out']
# except KeyError as e:
#     raise RuntimeError(f"缺少必要的注入变量: {e}. 请确保 Java 端已注入 srf_agent, srf_session, srf_system_out")

class Agent:
    def __init__(self):
        pass

    def fetch_chunks(
            self,
            request: dict
    ) -> dict:
        """
        执行资料片段查询，返回分页结果数据。

        参数:
            request: 请求参数字典。
        """
        # return json.loads(srf_agent.fetch_chunks(request))
        return json.loads(aichat_utils.request.post("agent", "fetch_chunks", request=request))

    def list_documents_by_chunks(
            self,
            request: dict
    ) -> dict:
        """
        通过资料片段查询列出相关的文档。

        参数:
            request: 请求参数字典。
        """
        # return json.loads(srf_agent.list_documents_by_chunks(request))
        return json.loads(aichat_utils.request.post("agent", "list_documents_by_chunks", request=request))

    def download_document(
            self,
            request: dict,
            document_id: str,
            type: str = "full",
            **kwargs
    ) -> str:
        """
        下载文档。

        参数:
            request: 请求参数字典。
            document_id: 文档ID。
            type: 文档类型。
        """
        # return srf_agent.download_document(request, document_id, type, kwargs)
        return aichat_utils.request.post("agent", "download_document", request=request, document_id=document_id,
                                         type=type, params=kwargs)
    
    def download_oss_file(
            self,
            folder: str,
            file_id: str,
            **kwargs
    ) -> str:
        """
        下载osswenj。

        参数:
            folder: 文件目录。
            file_id: 文档ID。
        """
        # return srf_agent.download_document(request, document_id, type, kwargs)
        return aichat_utils.request.post("agent", "download_oss_file", folder=folder, file_id=file_id, params=kwargs)

    def output_step(self, message: str, title: str = None, **kwargs) -> None:
        # srf_agent.output_step(message, title, kwargs)
        aichat_utils.request.post("agent", "output_step", message=message, title=title, params=kwargs)

    def output_raw(self, message: str, append: bool = False, **kwargs) -> None:
        # srf_agent.output_raw(content, append, kwargs)
        aichat_utils.request.post("agent", "output_raw", message=message, append=append, params=kwargs)

    def wait_for_input(self, message: str, next: str, **kwargs) -> None:
        # srf_agent.wait_for_input(message, next, kwargs)
        aichat_utils.request.post("agent", "wait_for_input", message=message, next=next, params=kwargs)

    def chat_completion(
            self,
            request: dict,
            append_system: bool = True,
            append_histories: bool = True,
            result_mode: Literal["raw", "json", "content", "object"] = "content",
            **kwargs
    ) -> Union[dict, str, Any]:
        """
        执行聊天补全请求，并根据 result_mode 处理返回结果。

        参数:
            request: 请求参数字典。
            append_system: 是否追加系统提示词。
            append_histories: 是否追加历史对话。
            result_mode:
                - "raw": 直接返回原始响应字典。
                - "content": 提取首条消息的文本内容。
                - "message": 提取首条消息
                - "json": 提取首条消息内容，并使用 json_repair 修复为正确的 JSON 字符串。
                - "object": 提取首条消息内容，并使用 json_repair 修复为 Python 对象。
            **kwargs: 其他传递给 agent 的参数。

        返回:
            根据 result_mode 返回原始字典、解析后的 JSON 字符串/对象或纯文本内容。
        """
        # print ("开始调用")
        # 1. 调用底层 agent (不能解包 kwargs)
        raw_response = json.loads(
            aichat_utils.request.post("agent", "chat_completion", request=request, append_system=append_system,
                                      append_histories=append_histories, params=kwargs))
        # raw_response = json.loads(srf_agent.chat_completion(request, append_system, append_histories, kwargs))
        # print ("结束调用")
        # 2. 处理 raw 模式
        if result_mode == "raw":
            return raw_response

        # 3. 安全提取文本内容 (兼容字典格式和可能的对象格式)
        content_text = ""
        message = {}

        if isinstance(raw_response, dict):
            # 标准 OpenAI 兼容格式: {"choices": [{"message": {"content": "..."}}]}
            choices = raw_response.get("choices", [])
            if choices and len(choices) > 0:
                message = choices[0].get("message", {})
                content_text = message.get("content", "")
            else:
                # 备选：某些接口可能直接返回 text 字段
                content_text = raw_response.get("text", "")

        elif hasattr(raw_response, 'choices'):
            # 如果是对象类型 (例如 Pydantic 模型或特定 SDK 响应对象)
            if raw_response.choices:
                message = raw_response.choices[0].message
                content_text = raw_response.choices[0].message.content

        # 处理空内容情况
        if not content_text:
            if result_mode == "content":
                return ""
            elif result_mode in ["json", "object"]:
                # 对于需要解析的模式，空内容通常意味着错误
                raise ValueError("Received empty content from chat completion, cannot extract JSON/Object.")
            return raw_response

        # 4. 根据模式处理内容
        if result_mode == "message":
            return message

        if result_mode == "content":
            return content_text

        elif result_mode in ["json", "object"]:
            try:
                # 使用 json_repair 进行修复
                # return_objects=False (默认) -> 返回修复后的 JSON 字符串
                # return_objects=True  -> 返回修复后的 Python 对象
                return_objects = (result_mode == "object")

                repaired_result = repair_json(content_text, return_objects=return_objects)

                if repaired_result is None:
                    raise ValueError("json_repair failed to extract any valid structure from the content.")

                return repaired_result

            except Exception as e:
                raise ValueError(f"Failed to process content with mode '{result_mode}': {str(e)}")

        else:
            raise ValueError(f"Invalid result_mode: {result_mode}. Must be 'raw', 'content', 'json', or 'object'.")


class Session:
    def __init__(self):
        pass

    def get_param(self, key):
        # return srf_session.get_param(key)
        return aichat_utils.request.post("session", "get_param", key=key)

    def set_param(self, key, value):
        # srf_session.set_param(key, value)
        aichat_utils.request.post("session", "set_param", key=key, value=value)

    def reset_param(self, key):
        return aichat_utils.request.post("session", "reset_param", key=key)

    def get_request(self) -> dict:
        ret = aichat_utils.request.post("session", "get_request")
        return json.loads(ret)
        # return json.loads(srf_session.get_request())

    def get_next(self):
        # return srf_session.get_next()
        return aichat_utils.request.post("session", "get_next")

    def get_request_oss_files(self) -> List[str]:
        json_content = aichat_utils.request.post("session", "get_request_oss_files")    
        return repair_json(json_content, return_objects=True)

    


# class SystemOut:
#     def __init__(self):
#         pass

#     def write(self, data):
#         if data:
#             srf_system_out.append(str(data))

#     def flush(self):
#         srf_system_out.flush()

class Utils:
    def __init__(self):
        pass

    def get_histories(
            self,
            request: Dict[str, Any],
            n: int,
            include_system: bool = False
    ) -> List[Dict[str, Any]]:
        """
        从 chat completion 请求字典中提取最近的 N 条非 system 角色的消息。

        参数:
            request (dict): 包含 'messages' 列表的请求字典。
            n (int): 需要提取的消息数量。
            include_system (bool): 是否包含 system 角色的消息。

        返回:
            List[Dict]: 包含最近 N 条消息的列表（按时间顺序排列）。
        """
        # 1. 获取消息列表，如果不存在则返回空列表
        messages = request.get("messages", [])

        if not messages:
            return []

        # 2. 过滤消息
        # 保留 user, assistant, function, tool 等其他角色
        filtered_messages = messages
        if (not include_system):
            filtered_messages = [
                msg for msg in messages
                if isinstance(msg, dict) and msg.get("role") != "system"
            ]

        # 3. 提取最近的 N 条
        # 列表切片 [-n:] 会自动处理 n 大于列表长度的情况
        recent_messages = filtered_messages[-n:]

        return recent_messages

    def extract_code_blocks(self, text: str, language: str = "python") -> list:
        """
        从文本中提取指定语言的代码块。

        参数:
            text: 包含 Markdown 格式代码的完整文本。
            language: 要提取的语言标识 (如 'python', 'json', 'java')。设为 None 可提取所有代码块。

        返回:
            包含提取出的代码字符串的列表。
        """
        # 正则解释:
        # ```            : 匹配开始的三个反引号
        # (\w*)          : 捕获组1，匹配语言标识 (可选)
        # \n             : 匹配换行
        # (.*?)          : 捕获组2，非贪婪匹配代码内容 (核心部分)
        # \n```          : 匹配结束的三个反引号
        # re.DOTALL      : 让 . 也能匹配换行符

        if language:
            pattern = r"```" + re.escape(language) + r"\n(.*?)\n```"
        else:
            # 匹配任意语言或无语言标识的代码块
            pattern = r"```(\w*)?\n(.*?)\n```"

        matches = re.findall(pattern, text, re.DOTALL)

        code_blocks = []
        for match in matches:
            if language:
                # 如果指定了语言，matches 直接是代码内容
                code_blocks.append(match.strip())
            else:
                # 如果没指定语言，match 是一个元组 (语言标识, 代码内容)，取第二个元素
                code_blocks.append(match[1].strip())

        return code_blocks


# 3. 重定向 stdout
# sys.stdout = SystemOut()
# sys.stderr = SystemOut() # 通常也建议重定向 stderr

# 4. 导出实例
aichat_utils.agent = Agent()
aichat_utils.session = Session()
aichat_utils.utils = Utils()
aichat_utils.request = InternalRequest()

