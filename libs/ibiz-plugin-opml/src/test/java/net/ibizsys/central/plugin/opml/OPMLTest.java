package net.ibizsys.central.plugin.opml;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.rometools.opml.feed.opml.Opml;
import com.rometools.opml.feed.opml.Outline;
import com.rometools.rome.feed.WireFeed;
import com.rometools.rome.io.WireFeedInput;

public class OPMLTest {

	public static void main(String[] args) throws Exception{
		WireFeedInput input = new WireFeedInput();
		WireFeed wireFeed = input.build(new File("d:\\11.opml"));

		if (wireFeed instanceof Opml) {
			Opml opml = (Opml) wireFeed;

			List<Map> modules = new ArrayList<>();
			List<Map> cases = new ArrayList<>();

			recursionParseOutlines(opml.getOutlines(), null, modules, cases);

			// 模块
			System.out.println(modules);

			// 用例
			System.out.println(cases);
		}
	}

	public static void recursionParseOutlines(List<Outline> outlines, Outline parent, List<Map> modules, List<Map> cases) {
		if (!ObjectUtils.isEmpty(outlines)) {
			for (Outline outline : outlines) {
				String[] str = outline.getText().split(":");
				// 用例
				if (str.length == 2 && str[0].equals("tc")) {
					Map _case = parseOutline(outline);
					if (parent != null)
						_case.put("module", parent.getText());
					cases.add(_case);
					continue;
				}
				// 模块
				Map _module = new HashMap();
				_module.put("name", outline.getText());
				if (parent != null) {
					_module.put("parent", parent.getText());
				}
				modules.add(_module);
				// 模块 递归
				recursionParseOutlines(outline.getChildren(), outline, modules, cases);
			}
		}
	}

	public static Map parseOutline(Outline outline) {
		// 用例
		Map _case = new HashMap<>();
		_case.put("name", outline.getText().split(":")[1]);
		if (!ObjectUtils.isEmpty(outline.getChildren())) {
			for (Outline subOutline : outline.getChildren()) {
				//
				String[] str = subOutline.getText().split(":");
				if (str.length != 2) {
					continue;
				}
				if (str[0].equals("tt")) {
					_case.put("type", str[1]);
				}
				if (str[0].equals("ti")) {
					_case.put("important", str[1]);
				}
				if (str[0].equals("tp")) {
					_case.put("precondition", str[1]);
				}
				// 步骤
				if (str[0].equals("ts")) {
					if (!_case.containsKey("steps")) {
						_case.put("steps", new ArrayList<>());
					}
					Map step = new HashMap<>();
					step.put("name", str[1]);
					// 预期结果
					if (!ObjectUtils.isEmpty(subOutline.getChildren())) {
						step.put("result", subOutline.getChildren().get(0).getText());
					}
					((List) _case.get("steps")).add(step);
				}
				if (str[0].equals("tr")) {
					_case.put("memo", str[1]);
				}
			}
		}
		return _case;
	}
}
