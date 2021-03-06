package kr.hs.dgsw.webclass01.Service;

import java.util.List;

import kr.hs.dgsw.webclass01.Domain.Product;
import kr.hs.dgsw.webclass01.Domain.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }

    @Override
    public Long add(Product product) {
        return productMapper.add(product);
    }

    @Override
    public int modify(Product product) {
        return productMapper.modify(product);
    }

    @Override
    public Product findById(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> findByMenuId(Long menuid) {
        return productMapper.findByMenuId(menuid);
    }

    @Override
    public List<Product> findBySubMenuId(Long subMenuId) {
        return productMapper.findBySubMenuId(subMenuId);
    }
}