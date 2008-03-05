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
/// Summary description for utils
/// </summary>
public class utils
{
	public utils()
	{
		//
		// TODO: Add constructor logic here
		//
	}
    public static int getRandomID () {
Random r = new Random() ;
 // remember random is time dependent
// you can also give it a seed by Random(int)

return r.Next(10000,99999);
 // gives you a random number
//between 10000 and 99999, which is
//a 5 digit num
}
}
