// This file was generated by Mendix Modeler.
//
// NOTE: This proxy class is copied from generated Modeler code in order to build CommunityCommons with Gradle

package communitycommons.proxies;

public enum DatePartSelector
{
	year(new java.lang.String[][] { new java.lang.String[] { "en_US", "year" }, new java.lang.String[] { "nl_NL", "jaar" } }),
	month(new java.lang.String[][] { new java.lang.String[] { "en_US", "month" }, new java.lang.String[] { "nl_NL", "maand" } }),
	day(new java.lang.String[][] { new java.lang.String[] { "en_US", "day" }, new java.lang.String[] { "nl_NL", "dag" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DatePartSelector(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}