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


def process_data(employee_list):
        department_list = []
        for employee_data in employee_list : 
                department_list.append(employee_data['Department'])
        department_data = {}

        for department_name in set(department_list) : 
                department_data[department_name] = department_list.count(department_name)
        return department_data

def write_report(dictionary, report_file):
        with open(report_file, 'w+') as file : 
                for key in sorted(dictionary) : 
                        file.write(str(key) + ':' + str(dictionary[key]) + '\n')
                file.close()


employee_list = read_employees('/home/student-02-de954eeb0f44/data/employees.csv')
# print(employee_list)

dictionary = process_data(employee_list)
#print(dictionary)

write_report(dictionary, '/home/student-02-de954eeb0f44/test_report.txt')