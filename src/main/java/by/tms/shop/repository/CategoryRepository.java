package by.tms.shop.repository;

import by.tms.shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    boolean existsCategoryByName(String categoryName);
    Category findCategoryByName(String categoryName);
    Category findCategoryById(long id);
    boolean existsCategoryById(long id);
}
