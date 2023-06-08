    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class dbConnector {
    
  private Connection connect;
  
  //constructor to connect to our database 
  public dbConnector(){
      
      try{
          connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/account queuing system", "root","");
      }catch(SQLException ex){
          System.out.println("Can't connect to database:"+ex.getMessage());
      }
  }
  
  //function to retrieve data
  public ResultSet getData(String sql)throws SQLException{
      
      
      Statement stmt=connect.createStatement();
      ResultSet rst= stmt.executeQuery(sql);   
      return rst;
     
   }
  //function to save data
  
  public int insertData(String sql){
      int result;
      try{
       PreparedStatement pst= connect.prepareStatement(sql);
       pst.executeUpdate();
       System.out.println("Inserted Successfully!");
       pst.close();
       result=1;
     }catch(SQLException ex){
          System.out.println("Connection error:"+ex);
          result=0;
      }
      return result;
  }
  //function to Update data
  public void updateData(String sql){
      
      try{
       PreparedStatement pst= connect.prepareStatement(sql);
       int rowsUpdated=pst.executeUpdate();
       if(rowsUpdated>0){
        JOptionPane.showMessageDialog(null,"Data Updated Succesfully!");
       }else{
           System.out.println("Data Update Failed!");
       }
       pst.close();
      }catch(SQLException ex){
         System.out.println("Connection error:"+ex);
      }
        
  }
  public void deleteData(int id,String table,String table_id) {
    try {
        PreparedStatement pst =connect.prepareStatement("DELETE FROM "+table+" WHERE "+table_id+" = ?");
        pst.setInt(1, id);
       
        int rowsDeleted = pst.executeUpdate();
        if (rowsDeleted > 0) {
           JOptionPane.showMessageDialog(null,"Deleted Succesfully!");
        } else {
            System.out.println("Deletion Failed!");
        }
  
        pst.close();
  
    } catch (SQLException ex) {
        System.out.println("Connection error:"+ex);

    }
    
    
}
  public int loginData(String sql,String user,String pass){
     
        int num=0;

            try{
               
         ResultSet rs;
         PreparedStatement pstmt = connect.prepareStatement(sql);
         pstmt.setString(1,user);
         pstmt.setString(2, pass);
        rs = pstmt.executeQuery();
         
          if(rs.next()) {
                System.out.println("Login successfully!");
                num = 1;    
            } else {
                System.out.println("Login failed!");
                num=0;
            }
          pstmt.close();
           }catch(SQLException e){
                System.out.println("Connection Error: "+e);
    }
return num;
}
}

