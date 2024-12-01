import java.util.List;

public class VechicleRentalSystem {
    List<Store> storeList;
    List<User> userList;
    
    VechicleRentalSystem(List<Store>storeList,List<User> userList){
        this.storeList=storeList;
        this.userList=userList;
    }
    
    public Store getStore(Location location){
        //based on location, we will filter out the store from storeList
        return storeList.get(0);
    }


    // adduser
    
    //removeUser
    
    //addStores
    
    //removeStores
}
