public enum ErrorCode {
  INSUFF_BAL(-99, "Withdrawn amount > Account Balance"),
  ;
  private int code;
  private String message;

  private ErrorCode(int code, String message){ //Enum use private constructor !!
    this.code =code;
    this.message = message;
  }
  
  public int getCode(){
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }
  
}
