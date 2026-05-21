from json_repair import repair_json, loads

# 方法 A: 获取修复后的字符串
fixed_str = repair_json(broken_json)

# 方法 B: 直接获取 Python 对象 (推荐)
data = loads(broken_json)