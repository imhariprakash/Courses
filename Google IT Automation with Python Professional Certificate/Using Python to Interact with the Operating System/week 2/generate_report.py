#!/usr/bin/env python3


import csv

def read_employees(csv_file_location):
        with open(csv_file_location) as file:
                csv.register_dialect('empDialect', skipinitialspace=True, strict=True)
                employee_file = csv.DictReader(file, dialect = 'empDialect')
                employee_list = []
                for data in employee_file:
                        employee_list.append(data)
                return employee_list

employee_list = read_employees('/home/student-02-de954eeb0f44/data/employees.csv')
print(employee_list)
