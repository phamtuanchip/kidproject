using System;
using System.Data;
using System.Configuration;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;

/// <summary>
/// Summary description for msAccessPlugin
/// </summary>
public class msAccessPlugin : dataInterface 
{
	public msAccessPlugin()
	{
		//
		// TODO: Add constructor logic here
		//
	}

    #region dataInterface Members


    public static userObj login(string userName, string userPass)
    {
        throw new Exception("The method or operation is not implemented.");
    }

    #endregion
}
