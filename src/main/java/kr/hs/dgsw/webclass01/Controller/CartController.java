package kr.hs.dgsw.webclass01.Controller;

import kr.hs.dgsw.webclass01.Domain.Cart;
import kr.hs.dgsw.webclass01.Service.CartService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping(value="/api/cart")
    public Long add(@RequestBody Cart cart) {
        return cartService.add(cart);
    }

    @DeleteMapping(value="/api/cart/{id}")
    public int deleteById(@PathVariable("id") Long id) {
        return cartService.deleteById(id);
    }

    @DeleteMapping(value="/api/cart/user/{userId}")
    public int deleteByUserId(@PathVariable("userId") Long userId) {
        return cartService.deleteByUserId(userId);
    }

    @GetMapping(value="/api/cart/{userId}/{productId}")
    public Cart findById(@PathVariable("userId") Long userId, @PathVariable("productId") Long productId) {
        return cartService.findById(userId, productId);
    }

    @GetMapping(value="/api/cart/user/{userId}")
    public List<Cart> findByUserId(@PathVariable("userId") Long userId) {
        return cartService.findByUserId(userId);
    }

    @PutMapping(value="/api/cart")
    public void modify(@RequestBody Cart cart) { cartService.modify(cart); }
}