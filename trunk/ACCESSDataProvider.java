import java.util.Properties;

/*
 * Copyright (C) 2003-2010 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */

/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * Oct 22, 2010  
 */
public class ACCESSDataProvider extends DataProvider {

  @Override
  public Data loadData(String type) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  

  @Override
  public void saveData(String type, Data data) throws Exception {
   
    
  }

  @Override
  public void saveData(String type, Properties props) throws Exception {
    // TODO Auto-generated method stub
    
  }



  @Override
  public void saveData(Data d) throws Exception {
    System.out.println("\n\n Luu giu lieu dang access code o day ");
    
  }

}
