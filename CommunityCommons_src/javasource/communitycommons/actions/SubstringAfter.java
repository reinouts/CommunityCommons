// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.StringUtils;

/**
 * Gets the substring after the first occurrence of a separator.
 */
public class SubstringAfter extends CustomJavaAction<String>
{
	private String str;
	private String separator;

	public SubstringAfter(IContext context, String str, String separator)
	{
		super(context);
		this.str = str;
		this.separator = separator;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.substringAfter(str, separator);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "SubstringAfter";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
