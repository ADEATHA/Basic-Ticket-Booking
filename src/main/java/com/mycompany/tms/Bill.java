/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bill {
    private ArrayList<Ticket> tk_list;
    private int original_sum, discount, lastsum, ticketCount;
    private String status;

    public Bill(ArrayList<Ticket> tk_list) {
        this.tk_list = tk_list;
        this.original_sum = 0;
        this.discount = 0;
        this.lastsum = 0;
        this.ticketCount = tk_list.size();
        this.status = "Chua thanh toan";
    }

    public ArrayList<Ticket> getTk_list() {
        return tk_list;
    }

    public void setTk_list(ArrayList<Ticket> tk_list) {
        this.tk_list = tk_list;
    }


    public void setOriginal_sum(int original_sum) {
        this.original_sum = original_sum;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setLastsum(int lastsum) {
        this.lastsum = lastsum;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
