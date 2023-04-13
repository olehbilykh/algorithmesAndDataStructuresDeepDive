package com.olehbilykh.DataStructures.Hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        this.hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }

    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            if (storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++;
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }
        if (storedEmployee == null) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.employee;
        }
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + " : empty ");
            } else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(" " + iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }

    private int hashKey(String key) {
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }
}
