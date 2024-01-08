package cart;

import java.util.ArrayList;
import Items.Item;
public class Cart {
    ArrayList<Item> cartList;
    public Cart(){
        this.cartList =new ArrayList<>();
    }

    public void addCart(Item item){
        this.cartList.add(item);
        System.out.println("장바구니에 담겼어요!!");
    }
    public void clearCart(){
        this.cartList.clear();
        System.out.println("장바구니가 비어있습니다!!");
    }

}
