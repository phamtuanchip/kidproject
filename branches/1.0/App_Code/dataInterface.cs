using System;
using System.Collections;
using System.Data;
using System.Configuration;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;

/// <summary>
/// Summary description for dataInterface
/// </summary>
public interface dataInterface
{
	public dataInterface()
	{
		//
		// TODO: Add constructor logic here
		//
	}

    public bool login(String userName, String userPass); 
    public IList getCategories() ;
    public category getCategoryById(String productId);
    public userObj getUserById(String productId);
    public IList getProducts();
    public product getProductById(String productId);
}
