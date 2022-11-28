package co.edu.icesi.JCStore.dto;

import com.sun.istack.NotNull;

import java.util.List;
import java.util.UUID;

public class OrderDTO {

    private UUID orderId;

    @NotNull
    private double total;

    @NotNull
    private String status;

    private List<ItemDTO> orderItems;
}
