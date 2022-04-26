package by.paramonov.warehousev3.exception;

public class WarehouseNotFoundException extends RuntimeException{
    public WarehouseNotFoundException(String message){
        super(message);
    }
    public WarehouseNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
