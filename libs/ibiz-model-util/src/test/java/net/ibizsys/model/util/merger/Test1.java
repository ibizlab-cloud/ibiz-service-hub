package net.ibizsys.model.util.merger;

import net.ibizsys.model.util.PSModelMergeUtils;

public class Test1 {

	public static void main(String[] args) {
		
		try {

			
			PSModelMergeContext psModelMergeContext = new PSModelMergeContext();
			psModelMergeContext.setPSModelFolderPath("H:\\R8\\ibiz-centralstudio\\CentralStudioPro\\centralstudio-core\\src\\main\\resources\\model\\net\\ibizsys\\centralstudio");
			psModelMergeContext.setMergePSModelFolderPath("E:\\Workspace\\idea\\LS\\ls-core\\src\\main\\resources\\model\\com\\sa\\szpg");
			psModelMergeContext.setDstPSModelFolderPath("D:\\mergefolder");
			
			PSModelMergeUtils.merge(psModelMergeContext);
			
			PSModelMergeUtils.verify("D:\\mergefolder");
			

//			
//			PSModelMergeUtils.mergeCloudSubApp("D:\\mergefolder", "E:\\Workspace\\idea\\LS\\ls-core\\src\\main\\resources\\model\\com\\sa\\szpg", "CentralStudio");
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
