/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nikit
 */
public class VehicleList {

    private ArrayList<Vehicle> vehicleList;

    public VehicleList() {

        vehicleList = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }


    public void getVehicleBySerialNo(String serialNo) {

        for (Vehicle v : vehicleList) {

            if (v.getSerialNo() == serialNo) {
// return v;
            }
            System.out.println(v.toString());
        }
    }

    public ArrayList<Vehicle> getVehicleByMake(String make) {

        ArrayList<Vehicle> tList = new ArrayList<>();

        for (Vehicle v : vehicleList) {

            if (v.getMake() == make) {
                tList.add(v);
            }
            System.out.println(v.toString());
        }
        return tList;
    }

    public void addVehicle(String make,
            String model,
            int yearOfMan,
            int maxSeats,
            String serialNo,
            String city,
            String maintenanceDate,
            boolean isAvaliable,
            String LicencePlate) {
        
        Vehicle newVehicle = new Vehicle(make, 
                model,
                yearOfMan,
                maxSeats,
                serialNo,
                city,
                maintenanceDate,
                System.currentTimeMillis(),
                isAvaliable,
                LicencePlate);
        vehicleList.add(newVehicle);

    }
    
    public long getLastUpdateTime() {

        long res = 0;

        for (Vehicle v : vehicleList) {
            if (v.getUpdateTime() > res) {
                res = v.getUpdateTime();
            }
        }
        return res;

    }
    
    public ArrayList<Vehicle> getMinMaxSeats(int min, int max) {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {

            if (v.getMaxSeats() >= min && v.getMaxSeats() <= max) {
                list.add(v);
            }
        }
        return list;
    }
    public ArrayList<Vehicle> getFirstAvaliableCar() {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.isIsAvaliable()) {
                list.add(v);
            }
        }
        return list;
    }
    
    public ArrayList<Vehicle> expiredMaintainance() {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            Date resultdate = new Date(v.getMaintenanceDate());
            if (resultdate.compareTo(new Date(System.currentTimeMillis())) < 0) {
                list.add(v);
            }
        }
        return list;
    }

    public ArrayList<String> getManuf() {
        Set<String> manuf = new HashSet<>();

        ArrayList<String> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            manuf.add(v.getMake().toLowerCase());
        }

        for (String s : manuf) {
            list.add(s);
        }
        return list;
    }
    
    public ArrayList<Vehicle> filterByCity(String text) {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getCity().matches(text)) {
                list.add(v);
            }
        }
        return list;
    }
    
    public ArrayList<Vehicle> filterByModel(String text) {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getModel().matches(text)) {
                list.add(v);
            }
        }
        return list;
    }
    
    public ArrayList<Vehicle> filterByManufYear(int year) {

        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getYearOfMan() == year) {
                list.add(v);
            }
        }

        return list;
    }
    
    public ArrayList<Vehicle> filterByMade(String make) {

        ArrayList<Vehicle> list = new ArrayList<>();
        for (Vehicle v : vehicleList) {
            if (v.getMake().contains(make)) {
                list.add(v);
            }
        }

        return list;
    }
    
    public void markUnaviable(String licence) {
        int i = -1;

        for (Vehicle v : vehicleList) {
            i++;
            if (v.getLicencePlate() == licence) {
                vehicleList.get(i).setIsAvaliable(false);
                vehicleList.get(i).setUpdateTime(System.currentTimeMillis());
                break;
            }
        }
    }
    
    
    public void deleteByLicencePlate(String licence) {
        for (Vehicle v : vehicleList) {

            if (v.getLicencePlate().matches(licence)) {
                vehicleList.remove(v);
                break;
            }
        }
    }
    public void addVehicle(String make,
            String model,
            int yearOfMan,
            int maxSeats,
            String serialNo,
            String city,
            String maintenanceDate,
            long time,
            boolean isAvaliable,
            String LicencePlate) {

        Vehicle newVehicle = new Vehicle(make, model,
                yearOfMan,
                maxSeats,
                serialNo,
                city,
                maintenanceDate,
                time,
                isAvaliable,
                LicencePlate
        );

        vehicleList.add(newVehicle);
    }
    
    public ArrayList<Vehicle> filterBySerialNo(String serialNo) {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getSerialNo().matches(serialNo)) {
                list.add(v);
            }
        }
        return list;
    }
}
