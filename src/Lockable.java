public interface Lockable {
    public void setKey(int theKey); //establishes the key
    public void lock(int lock); //lock the object, only if key is used correctly
    public void unlock(int unlock); //unlock the object, only if key is used correctly
    public boolean locked(); //true for locked, false if unlocked
}
