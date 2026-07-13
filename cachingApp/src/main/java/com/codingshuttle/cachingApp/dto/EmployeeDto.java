package com.codingshuttle.cachingApp.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDto implements Serializable // so it could be converted to Byte Array , so the redis can communicate with springboot
{
    private Long id;
    private String email;
    private String name;
    private Long salary;
}
