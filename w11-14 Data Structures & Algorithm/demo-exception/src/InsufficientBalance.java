public class InsufficientBalance extends BusinessException {
  public InsufficientBalance(){ //為左唔俾enum
    super(ErrorCode.INSUFF_BAL);
  }

  public String sleep(){ // cannot , coz all is parents,, not this.
    return "sleeping";
  }
}
