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
/// Summary description for sqlServerPlugin
/// </summary>
public class sqlServerPlugin : dataInterface 
{
	public sqlServerPlugin()
	{
		//
		// TODO: Add constructor logic here
		//
	}

    #region dataInterface Members


    bool dataInterface.login(string userName, string userPass)
    {
        throw new Exception("The method or operation is not implemented.");
    }

    public System.Collections.IList getCategories()
    {
        throw new Exception("The method or operation is not implemented.");
    }

    public category getCategoryById(string productId)
    {
        throw new Exception("The method or operation is not implemented.");
    }

    public userObj getUserById(string productId)
    {
        throw new Exception("The method or operation is not implemented.");
    }

    public System.Collections.IList getProducts()
    {
        throw new Exception("The method or operation is not implemented.");
    }

    public product getProductById(string productId)
    {
        throw new Exception("The method or operation is not implemented.");
    }

    #endregion
}
