package testUtils;


import frameworkBase.TestBotBase;

public class ExtraFieldUtils extends TestBotBase {
	
	public enum EFType
	{
		ALL,FILE,TEXT,NUMBER,DATE,TIME,ACCOUNT,IFSC,PREFIX,POSTFIX,MULTISELECT,DATERANGE,NONE;
	}
	public enum EFSetting
	{
		MANDATORY,EXPORTABLE,READONLYPERMISSION,NONE,DEPENDENT,ALL;
	}

}
