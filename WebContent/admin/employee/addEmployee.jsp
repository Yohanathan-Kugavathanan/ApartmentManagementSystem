<%@  page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>

		 <form action="../../addEmployee" method="post">
                <table>
                              <tr>
                                 <td>Employee ID</td> 
                                 <td><input type="text"  name="eid"></td>
                            </tr>

                             <tr>
                                 <td>First name</td> 
                                 <td><input type="text"  name="fname"></td>
                            </tr>
                            <tr>
                                <td>Last name </td>
                                <td><input type="text"  name="lname"></td>
                            </tr>
                            <tr>
                                <td>date of birth</td>
                                <td> <input type="text" name="dob"></td><!-- date -->
                            </tr>
                            <tr>
                            	<td>NIC</td>
                            	<td> <input type="text" name="NIC"></td>
                            </tr>
                            <tr>
                                <td>address</td>
                                <td>    <input type="text" name="lane">
                                        <input type="text" name="city">
                                        <input type="text" name="district">
                                </td>
                            </tr>    
                            <tr>
                                <td>gender</td>
                                 <td>  
                                     male   <input type="radio" name="gender" value="male">
                                     female <input type="radio" name="gender" value="female">       
                                 </td>        
                            </tr>
                            <tr>
                                 <td> Qualification</td>
                                 <td><textarea name="qualify1"></textarea>
                                 <textarea name="qualify2"></textarea>            
                                 <textarea name="qualify3"></textarea>
                                 <textarea name="qualify4"></textarea>
                                 <textarea name="qualify5"></textarea>   </td>           
                            </tr>
                            <tr>
                                <td>Contact Number</td>
                                <td><input type="text" name="tpNo"></td>
                            </tr>    
                            <tr>
                                <td>Salary</td>
                                <td><input type="text" name="salary"></td>
                            </tr>
                            <tr>
                                <td>Position</td>
                                <td><input type="text" ></td>
                            </tr>
                            <tr>
                                <td>School</td>
                                <td>
                                        <input type="text" name="school1">
                                        <input type="text" name="school2">
                                        <input type="text" name="school3"></td>
                            </tr>
                            <tr>
                                <td>Bank Account No</td>
                                <td><input type="text"  name="bankAccNo"></td>
                            </tr>
                            <tr>
                            	<td>experience</td>
                            	<td>
                            			<input type="text" name="exp1">
                                        <input type="text" name="exp2">
                                        <input type="text" name="exp3">
                                </td>        
                            </tr>
                            <tr>
                            	<td>employee Type</td>
                            	<td>
                            		<select name="empType">
                            			<option value="permanent">male</option>
                            			<option value="temporary">female</option>
                            		</select>	
                            	</td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="add"></td>
                                <td><input type="reset" value="reset"></td>
                            </tr>
              
                </table>
            </form>


</body>
</html>