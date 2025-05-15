# Supermarket Product Module Implementation

---

### Architecture Diagram
```
                                ┌───────────────────────┐
                                │   Products Module     │
                                │    Architecture       │
                                └──────────┬────────────┘
                                           │
           ┌──────────────────┬────────────┴─────────────┬───────────────────┐
           │                  │                          │                   │
┌──────────▼───────────┐ ┌────▼──────────────┐ ┌─────────▼─────────────┐ ┌───▼──────────────┐
│   Code Organization  │ │  Product Classes  │ │  Category System      │ │ Implementation   │
│  (Packages/Files)    │ │  (OOP Hierarchy)  │ │ (Category Tree)       │ │ (SOLID Principles)│
└──────────┬───────────┘ └─────┬─────────────┘ └─────────┬─────────────┘ └───┬──────────────┘
           │                   │                         │                    │
           │       ┌───────────┘                         │                    │
           │       │                                     │                    │
┌──────────▼───────▼───────┐                  ┌──────────▼────────────┐ ┌─────▼─────────────┐
│ com.supermarket.product  │                  │ Category Manager     │  │ ✅ SOLID Principles │
│ ├─ 📁 product/            │                │ (Manages Categories)  │ │ (Software Principles)│
│ │  ├─ 📄 Product.java     ◄───────────────┐└────────────┬──────────┘ └───────────────────┘
│ │  ├─ 📄 BaseProduct.java │               │             │
│ │  ├─ 📄 Perishable.java  │               │  ┌──────────▼──────────┐
│ │  └─ 📄 NonPerishable.java│              │  │ Category Instances  │
│ ├─ 📁 category/           │               │  │ (Actual Categories) │
│ │  ├─ 📄 Category.java    │               │  └──────────┬──────────┘
│ │  └─ 📄 CategoryManager  │               │             │
│ └─ 📁 inventory/          │               │  ┌──────────▼──────────┐
└───────────────────────────┘               │  │ Foods 🍽️           │
                                            │  │ Beverages          │
                                            │  │ Cleaning Supplies  │
                                            │  │ Household Items    │
                                            │  └────────────────────┘
```

---

### Detailed Breakdown:

#### 1. **Packages & Files** (`Code Organization`):
- **Root Package**: `com.supermarket.product`
  - 📁 **`product/`**: Core product classes.
    - 📄 `Product.java`: **Interface** defining common product behaviors (e.g., `getName()`, `getPrice()`).
    - 📄 `BaseProduct.java`: **Abstract class** implementing `Product` (shared logic for all products).
    - 📄 `Perishable.java` / `NonPerishable.java`: **Concrete classes** inheriting from `BaseProduct` (specific logic for perishable/non-perishable items).
  
  - 📁 **`category/`**: Category management.
    - 📄 `Category.java`: Class representing a category (e.g., name, parent category).
    - 📄 `CategoryManager.java`: Manages category operations (add/remove categories, build the hierarchy).

  - 📁 **`inventory/`**: (Optional) Inventory tracking logic (not expanded here).

---

#### 2. **Inheritance Hierarchy** (`Product Classes`):
```java
// Interface
public interface Product {} // Root contract

// Abstract Base Class
public abstract class BaseProduct implements Product {} // Shared logic

// Concrete Subclasses
public class Perishable extends BaseProduct {} // Expiration logic
public class NonPerishable extends BaseProduct {} // Non-expiring logic
```

---

#### 3. **Category System** (`Data Structure`):
- Managed by `CategoryManager` to enforce a **tree structure**:
  ```
  Foods 🍽️
  ├─ Fruits 🍎
  ├─ Vegetables 🥕
  └─ Meats 🥩
  
  Beverages
  └─ Water 💧
  
  Cleaning Supplies 🧹
  └─ Soap 🧼
  
  Household Items 🏠
  ├─ Tissues 🧻
  └─ Utensils 🍴
  ```

---

#### 4. **SOLID Principles** (`Implementation`):
- ✅ **Single Responsibility**:  
  - `CategoryManager` handles only category logic.  
  - `Perishable`/`NonPerishable` focus on product-specific behaviors.  

- ✅ **Open-Closed Principle**:  
  Add new categories (e.g., `Electronics`) without modifying `Category.java`.

- ✅ **Liskov Substitution**:  
  `Perishable`/`NonPerishable` can replace `BaseProduct` seamlessly.

- ✅ **Interface Segregation**:  
  `Product` interface is minimal (no bloated methods).

- ✅ **Dependency Inversion**:  
  Modules depend on `Product` interface, not concrete classes.

---