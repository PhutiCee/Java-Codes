package Assignment;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hotel {
    private String name;
    private String location;
    private List<Room> rooms;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRooms(Date startDate, Date endDate) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable(startDate, endDate)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public void reserveRoom(Room room, Date startDate, Date endDate) {
        room.reserve(startDate, endDate);
    }
}

class Room {
    private int number;
    private int capacity;
    private double pricePerNight;
    private Map<Date, Boolean> availability;

    public Room(int number, int capacity, double pricePerNight) {
        this.number = number;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.availability = new HashMap<>();
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable(Date startDate, Date endDate) {
        for (Map.Entry<Date, Boolean> entry : availability.entrySet()) {
            Date date = entry.getKey();
            if (!date.before(startDate) && !date.after(endDate) && !entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public void reserve(Date startDate, Date endDate) {
        Date currentDate = startDate;
        while (!currentDate.after(endDate)) {
            availability.put(currentDate, false);
            currentDate = new Date(currentDate.getTime() + 24 * 60 * 60 * 1000); // Increment by one day
        }
    }
}

class Reservation {
    private String customerName;
    private Room reservedRoom;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(String customerName, Room reservedRoom, Date checkInDate, Date checkOutDate) {
        this.customerName = customerName;
        this.reservedRoom = reservedRoom;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Room getReservedRoom() {
        return reservedRoom;
    }

    public double calculateTotalPrice() {
        long numDays = (checkOutDate.getTime() - checkInDate.getTime()) / (24 * 60 * 60 * 1000);
        return numDays * reservedRoom.getPricePerNight();
    }
}

class HotelManagementSystem {
    private List<Hotel> hotels;

    public HotelManagementSystem() {
        this.hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public List<Room> findAvailableRooms(Date startDate, Date endDate) {
        List<Room> availableRooms = new ArrayList<>();
        for (Hotel hotel : hotels) {
            availableRooms.addAll(hotel.getAvailableRooms(startDate, endDate));
        }
        return availableRooms;
    }

    public Reservation makeReservation(Hotel hotel, Room room, String customerName, Date startDate, Date endDate) {
        hotel.reserveRoom(room, startDate, endDate);
        return new Reservation(customerName, room, startDate, endDate);
    }
}

public class HotelProject {
    public static void main(String[] args) {
        // Example usage
        Hotel hotel1 = new Hotel("Hotel 1", "Location 1");
        Hotel hotel2 = new Hotel("Hotel 2", "Location 2");

        Room room1 = new Room(101, 2, 100.0);
        Room room2 = new Room(102, 4, 150.0);
        Room room3 = new Room(201, 3, 120.0);

        hotel1.addRoom(room1);
        hotel1.addRoom(room2);
        hotel2.addRoom(room3);

        HotelManagementSystem hotelManagementSystem = new HotelManagementSystem();
        hotelManagementSystem.addHotel(hotel1);
        hotelManagementSystem.addHotel(hotel2);

        Date startDate = new Date(); // Current date
        Date endDate = new Date(startDate.getTime() + 7 * 24 * 60 * 60 * 1000); // 7 days later

        List<Room> availableRooms = hotelManagementSystem.findAvailableRooms(startDate, endDate);
        System.out.println("Available rooms:");
        for (Room room : availableRooms) {
            System.out.println(
                    room.getNumber() + " - Capacity: " + room.getCapacity() + " - Price: " + room.getPricePerNight());
        }

        if (!availableRooms.isEmpty()) {
            Reservation reservation = hotelManagementSystem.makeReservation(hotel1, room1, "Keabetswe", startDate,
                    endDate);
            System.out.println("\nReservation details:");
            System.out.println("Customer: " + reservation.getCustomerName());
            System.out.println("Room: " + reservation.getReservedRoom().getNumber());
            System.out.println("Total Price: " + reservation.calculateTotalPrice());
        }
    }
}
