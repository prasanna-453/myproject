package com.neoteric.jdbcConnection;


import java.sql.*;
import java.util.*;

    public class JDBCConnection {
        public static List<Project> projectAllocation(){
            Collection<Project> jdbcproject=new ArrayList<>();
            Map<String,Project> map=new HashMap<>();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "sonar", "sonar");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select empId,empName,salary ,dept from sonar.Employee");

                while (resultSet.next()) {
                    System.out.println("Employee ID" + resultSet.getInt("ID") + "Employee name:" + resultSet.getString("name") + ",salary:" + resultSet.getDouble("salary")+"dept"+resultSet
                            .getString("dept"));
                    if(map.containsKey((resultSet.getString(2))))
                    {
                        Project project=map.get(resultSet.getString("name"));
                        Employee employee=new Employee();
                        employee.setEmpName(resultSet.getString("name"));
                        project.getEmployeesList().add(employee);



                    } else{
                        Project project=new Project();
                        project.setPid(resultSet.getInt(1));
                        List<Employee>employees=new ArrayList<>();
                        project.getEmployeesList();
                        project.setpName((resultSet.getString(2)));
                        Employee employee=new Employee();
                        employee.setEmpName(resultSet.getString("name"));
                        employees.add(employee);
                        map.put(resultSet.getString(2),project);
                    }

                }
                connection.close();
            }catch (ClassNotFoundException e){
                System.out.println("execption"+e.getMessage());
            }catch (SQLException e){
                System.out.println("SQL Exeception"+e.getMessage());
            }
            return  null;
        }
    }

