public class BusinessException extends Exception { //implies this is checked 
  private int code;//extends runtime 就已不同

  public int getCode() {
    return this.code;
  }

   // implies this is checked exception
  //public BusinessException(int code, String message) { //迫用家用ENUM先// 依個
   // super(message);
   // this.errorCode = errorCode; 
  
//}

public BusinessException(ErrorCode errorCode) { //迫死左, 
  super(errorCode.getMessage());
  this.code = errorCode.getCode();
}

public String codeWithMessgae(){  //encapsulation 
  return "Error" + this.code + "-" + this.getMessage();
}

}
