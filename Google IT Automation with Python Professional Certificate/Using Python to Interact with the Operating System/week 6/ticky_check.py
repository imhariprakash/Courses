#!/usr/bin/env python3

from asyncore import write
import subprocess
import re
import csv
   

def getPath():
    return(subprocess.run(["pwd"], capture_output=True,
                   text=True).stdout.strip() + "/Desktop/week 6")
    
    
def get_user_statistics():
    path = getPath()
    user_dict = {}
    with open(path + "/syslog.log", "r") as file:
        try:
            for line in file:
                line = line.strip()
                user_name = re.search(r"\((.*)\)$", line)[1]
                if (user_name not in user_dict):
                    user_dict[user_name] = {"INFO": 0, "ERROR": 0}
                if ("INFO" in line):
                    user_dict[user_name]["INFO"] += 1
                elif ("ERROR" in line):
                    user_dict[user_name]["ERROR"] += 1
        except TypeError:
            pass
    return user_dict


def get_error_stats():
    path = getPath()
    error_dict = {}
    
    with open(path + "/syslog.log", "r") as file:
        for line in file:
            line = line.strip()
            if("ERROR" in line):
                error = line.split("ERROR ")[1].split(" (")[0].strip()
                if(error not in error_dict):
                    error_dict[error] = 0
                error_dict[error] += 1
    return error_dict


def user_stats_header():
    return("Username","INFO","ERROR")

def error_stats_header():
    return(["Error","Count"])

def write_error_stats(error_stat_dict):
    with open(getPath() + "/error_message.csv", "w") as file:
        csv.writer(file).writerow(error_stats_header())
        for key in sorted(error_stat_dict, key=error_stat_dict.get, reverse=True):
            csv.writer(file).writerow([key, error_stat_dict[key]])
    return
            

def write_user_stats(user_stat_dict):
    with open(getPath() + "/user_statistics.csv", "w") as file:
        csv.writer(file).writerow(user_stats_header())
        for key in sorted(user_stat_dict):
            csv.writer(file).writerow([key, user_stat_dict[key]["INFO"], user_stat_dict[key]["ERROR"]])
    return

if __name__ == "__main__":
    user_stat_dict = get_user_statistics()
    error_stat_dict = get_error_stats()
    write_error_stats(error_stat_dict)
    write_user_stats(user_stat_dict)