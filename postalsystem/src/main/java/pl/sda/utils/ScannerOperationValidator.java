package pl.sda.utils;

public class ScannerOperationValidator {

  public static boolean validValue(String value) {
    int intValue;
    try{
      intValue = Integer.valueOf(value);
    }catch (NumberFormatException ex){
      return false;
    }
    if (intValue<0 || intValue >4){
      return false;
    }

    return true;
  }
}
