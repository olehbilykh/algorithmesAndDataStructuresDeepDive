package com.olehbilykh.DataStructures.Hashtable;

public class SimpleHashTable {
    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {
            int stop = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stop) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("Position " + hashedKey + " is taken");
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) return null;
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        StoredEmployee[] oldHt = hashtable;
        hashtable = new StoredEmployee[oldHt.length];
        for (int i = 0; i < oldHt.length; i++) {
            if (oldHt[i] != null) {
                put(oldHt[i].key, oldHt[i].employee);
            }
        }
        return employee;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stop = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stop && hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }

    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println(hashtable[i].employee);
            }
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
