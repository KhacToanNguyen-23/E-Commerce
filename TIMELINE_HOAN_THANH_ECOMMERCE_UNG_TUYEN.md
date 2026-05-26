# Timeline hoan thanh e-commerce de ung tuyen

Ngay cap nhat: 2026-05-23

## 1. Boi canh hien tai

Trang thai du an:

- Backend da co nen tang Spring Boot, modular monolith, JPA, Security/JWT, MySQL.
- Project da up len GitHub.
- Huong phat trien database: **DB-first**.
- Frontend hien tai moi biet **HTML/CSS**, chua nen nhay ngay vao React neu chua nam JS/DOM/API.
- Muc tieu: vua hoc vua ap dung vao project, co san pham du de dua vao CV va phong van fresher/intern/junior Java Backend.

Danh gia thoi gian hop ly:

- Neu hoc va lam moi ngay 2-3 gio: **4.5 - 6 thang**.
- Neu hoc va lam moi ngay 4-6 gio: **3 - 4 thang**.
- Neu chi lam cuoi tuan: **7 - 9 thang**.

Khuyen nghi: dat muc tieu **16 tuan** cho MVP ung tuyen, sau do them **4-8 tuan** de nang cap thanh portfolio manh.

## 2. Muc tieu san pham ung tuyen

Sau khi hoan thanh, project nen chung minh duoc cac nang luc sau:

- Thiet ke database quan he cho e-commerce.
- Lam backend REST API bang Spring Boot.
- Dung Spring Security + JWT.
- Dung JPA/Hibernate dung cach.
- Dung DTO, Mapper, Validation, Exception Handling.
- Lam CRUD va business flow that: cart, checkout, order, inventory.
- Biet migration DB bang Flyway.
- Biet document API bang Swagger.
- Biet test backend.
- Biet deploy backend/frontend/database len moi truong public.
- Biet viet README, API docs, ERD, demo flow de nha tuyen dung xem.

## 3. Cong nghe nen co trong project

Backend:

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Spring Security
- JWT
- MySQL khi local
- Flyway migration
- MapStruct
- Lombok
- Jakarta Validation
- Swagger/OpenAPI
- JUnit 5, Mockito, MockMvc
- Docker

Database:

- MySQL local
- DB-first design
- ERD ro rang
- SQL migration scripts
- Index, unique constraint, foreign key
- Seed data

Frontend giai doan dau:

- HTML
- CSS
- JavaScript co ban
- DOM manipulation
- Fetch API
- Responsive layout

Frontend portfolio giai doan sau:

- React + Vite + TypeScript, neu con thoi gian
- Hoac HTML/CSS/JS vanilla nhung phai co UI day du va ket noi API that

Deploy:

- GitHub
- Backend: Render/Koyeb free-tier
- Database: Neon Postgres hoac MySQL free service neu tim duoc on dinh
- Frontend: Vercel/Cloudflare Pages/GitHub Pages

## 4. Timeline 16 tuan cho MVP ung tuyen

### Tuan 1: On dinh nen tang va DB-first

Hoc:

- Quan he 1-1, 1-n, n-n.
- Primary key, foreign key, unique, index.
- Cach chuyen business requirement thanh table.

Lam:

- Ve ERD ban dau cho shop quan ao.
- Chot cac bang cot loi:
  - users
  - roles
  - categories
  - products
  - product_variants
  - product_images
  - carts
  - cart_items
  - orders
  - order_items
  - payments
  - shippings
  - promotions
  - reviews
  - inventory_transactions
- Sua lai `db.sql` theo DB-first.
- Tao seed data: category, product, variant size/mau, admin user.

Ket qua:

- Co ERD.
- Co SQL schema sach.
- Co data mau de test API.

### Tuan 2: Refactor backend theo database

Hoc:

- JPA mapping tu database co san.
- Entity relationship.
- Lazy loading, cascade, orphan removal.

Lam:

- Dong bo Entity voi DB schema.
- Sua repository.
- Sua mapper DTO.
- Chuan hoa naming endpoint.
- Chuyen config nhay cam ra environment variables.

Ket qua:

- Project compile.
- Spring Boot connect DB thanh cong.
- Entity map dung voi database.

### Tuan 3: Auth va Security

Hoc:

- Spring Security flow.
- BCrypt.
- JWT access token.
- Role-based authorization.

Lam:

- Hoan thien register.
- Hoan thien login.
- Hoan thien `GET /api/users/me`.
- Phan quyen CUSTOMER/ADMIN.
- Sua `AuthController`, `IAuthService`, `AuthService`.

Ket qua:

- Dang ky/dang nhap thanh cong.
- API admin bi chan neu khong co role ADMIN.

### Tuan 4: Category va Product public API

Hoc:

- REST API convention.
- Pagination, sorting.
- Request param filter.

Lam:

- Category CRUD cho admin.
- Product listing public.
- Product detail theo slug/id.
- Search product theo ten.
- Filter theo category, price, size, color.
- Pagination.

Ket qua:

- Guest xem duoc danh sach san pham.
- Admin quan ly duoc category/product co ban.

### Tuan 5: Product variant, image, inventory

Hoc:

- Thiet ke product co bien the.
- Stock management.
- Transaction co ban.

Lam:

- CRUD product variant: size, color, SKU, stock.
- Gan nhieu anh cho product.
- Ghi inventory transaction khi nhap/xuat kho.
- API admin cap nhat ton kho.

Ket qua:

- Mot ao co nhieu size/mau.
- Ton kho quan ly theo variant, khong quan ly chung theo product.

### Tuan 6: Cart va Wishlist

Hoc:

- Business rule validation.
- Transaction trong service.

Lam:

- Add item vao cart theo variant.
- Update quantity.
- Remove item.
- Clear cart.
- Validate ton kho.
- Wishlist add/remove/list.

Ket qua:

- Customer co gio hang that.
- Khong add qua so luong ton kho.

### Tuan 7: Checkout va Order

Hoc:

- Transaction boundary.
- Snapshot order data.
- Trang thai don hang.

Lam:

- Checkout tu cart.
- Tao order va order items.
- Tru ton kho.
- Luu snapshot gia, ten san pham, size, mau.
- Customer xem lich su don.
- Customer xem chi tiet don.

Ket qua:

- Flow mua hang dau tien chay tron: login -> add cart -> checkout -> order.

### Tuan 8: Payment COD, Shipping, Promotion

Hoc:

- Payment status.
- Coupon rule.
- Shipping fee rule.

Lam:

- Payment method COD.
- Shipping address.
- Flat shipping fee.
- Coupon giam gia percent/fixed.
- Admin tao/sua promotion.

Ket qua:

- Checkout co tinh tong tien, giam gia, phi ship.

### Tuan 9: Admin order management

Hoc:

- Admin workflow.
- Status transition.

Lam:

- Admin list order.
- Filter order theo status/date/customer.
- Admin cap nhat status:
  - PENDING_PAYMENT
  - PROCESSING
  - SHIPPED
  - DELIVERED
  - CANCELLED
- Them tracking number.

Ket qua:

- Admin quan ly vong doi don hang.

### Tuan 10: Review, notification, audit

Hoc:

- Authorization theo resource ownership.
- Audit logging.

Lam:

- Customer review san pham da mua.
- Admin an/hien review.
- Notification khi tao don/cap nhat don.
- Audit log hanh dong admin quan trong.

Ket qua:

- Project co cac module nang cao hon CRUD binh thuong.

### Tuan 11: Validation, exception, API response, Swagger

Hoc:

- Jakarta Validation.
- Global exception handling.
- OpenAPI/Swagger.

Lam:

- Them validation cho request DTO.
- Chuan hoa response thanh `ApiResponse<T>`.
- Chuan hoa error response.
- Them Swagger UI.
- Viet API docs ngan trong README.

Ket qua:

- API de test, de demo, de phong van.

### Tuan 12: Testing backend

Hoc:

- Unit test.
- Mockito.
- MockMvc.
- Integration test co ban.

Lam:

- Test AuthService.
- Test ProductService.
- Test CartService.
- Test CheckoutService.
- Test controller auth/product/cart/order.
- Tao profile test rieng.

Ket qua:

- `mvnw test` pass.
- Co bang chung biet test khi ung tuyen.

### Tuan 13: Frontend HTML/CSS/JS ket noi API

Hoc:

- JavaScript co ban.
- DOM.
- Fetch API.
- LocalStorage.
- Form submit.

Lam:

- Tao frontend vanilla:
  - home.html
  - products.html
  - product-detail.html
  - login.html
  - register.html
  - cart.html
  - checkout.html
  - orders.html
  - admin-products.html
  - admin-orders.html
- Goi API backend bang `fetch`.
- Luu JWT vao localStorage.
- Render data that tu backend.

Ket qua:

- Frontend tuy don gian nhung dung API that, demo duoc flow mua hang.

### Tuan 14: UI hoan thien va responsive

Hoc:

- CSS Flexbox/Grid.
- Responsive design.
- UI state: loading, empty, error.

Lam:

- Responsive mobile/desktop.
- Header, navbar, filter sidebar.
- Product card.
- Cart table.
- Checkout form.
- Admin table.
- Toast/message co ban.

Ket qua:

- Giao dien du dep va du dung cho demo ung tuyen.

### Tuan 15: Docker va deploy

Hoc:

- Dockerfile.
- Environment variables.
- Cloud deployment co ban.

Lam:

- Tao Dockerfile backend.
- Them profile prod.
- Chuyen DB prod sang cloud database.
- Deploy backend len Render/Koyeb.
- Deploy frontend len Vercel/Cloudflare Pages/GitHub Pages.
- Cau hinh CORS.

Ket qua:

- Co URL frontend public.
- Co URL backend public.
- Demo duoc tren may nguoi khac.

### Tuan 16: README, CV, demo, phong van

Hoc:

- Cach viet technical README.
- Cach trinh bay project khi phong van.

Lam:

- Viet README moi:
  - Mo ta project.
  - Tech stack.
  - Features.
  - ERD.
  - API docs.
  - Demo account.
  - Screenshot.
  - Deploy URL.
  - How to run local.
- Tao video demo 3-5 phut.
- Tao file `PROJECT_REPORT.md`.
- Clean GitHub repo.

Ket qua:

- Project san sang dua vao CV.
- Co noi dung de noi trong phong van.

## 5. Giai doan nang cap 4-8 tuan sau MVP

Neu muon project noi bat hon, lam tiep:

### Tuan 17-18: Migration va CI/CD

- Chuyen schema sang Flyway migration day du.
- Them GitHub Actions:
  - build
  - test
  - package
- Them badge vao README.

### Tuan 19-20: Frontend React

Neu da nam HTML/CSS/JS co ban, bat dau React:

- React + Vite.
- React Router.
- TanStack Query.
- Component product card, cart, checkout.
- Admin dashboard co table/filter.

Neu chua vung JS, tiep tuc vanilla JS, khong nen ep React qua som.

### Tuan 21-22: Advanced backend

- Refresh token.
- Forgot password.
- Email notification.
- Upload image Cloudinary.
- Rate limit API auth.
- Soft delete product.

### Tuan 23-24: Observability va polish

- Logging chuan.
- Actuator health.
- Error tracking co ban.
- Performance: index, query optimization.
- Them Postman collection.
- Them architecture diagram.

## 6. Lich hoc moi tuan de khong bi qua tai

Moi ngay 2-3 gio:

- 30 phut hoc ly thuyet.
- 90-120 phut code vao project.
- 15 phut ghi note loi gap phai.
- 15 phut commit code len GitHub.

Moi tuan:

- 5 ngay code tinh nang.
- 1 ngay fix bug/test/refactor.
- 1 ngay viet README/note va xem lai kien thuc.

Commit nen nho va ro:

```text
feat(auth): implement login API
feat(product): add product listing with pagination
fix(cart): prevent quantity greater than stock
test(order): add checkout service tests
docs(readme): add local setup guide
```

## 7. Thu tu uu tien neu bi cham tien do

Neu khong kip 16 tuan, cat bot theo thu tu:

Nen giu lai:

- Auth.
- Product/category.
- Product variant.
- Cart.
- Checkout.
- Order.
- Admin product/order.
- Swagger.
- Deploy.

Co the de sau:

- Notification.
- Audit log.
- Review image.
- Advanced promotion.
- React.
- Email.
- Online payment.

## 8. Diem nhan khi dua vao CV

Co the viet trong CV:

```text
E-commerce Clothing Store - Java Spring Boot Backend
- Built RESTful APIs for product catalog, variants, cart, checkout, orders, promotions, and admin management.
- Designed DB-first relational schema for clothing products with size/color variants and inventory tracking.
- Implemented JWT authentication, role-based authorization, DTO mapping, validation, and global exception handling.
- Added Swagger API documentation, unit/controller tests, Docker deployment, and public demo environment.
- Tech stack: Java 17, Spring Boot, Spring Security, Spring Data JPA, MySQL/PostgreSQL, Flyway, MapStruct, Docker, HTML/CSS/JavaScript.
```

## 9. Moc hoan thanh de ung tuyen

Moc toi thieu de bat dau nop CV:

- Tuan 12 neu backend da chay tot, co Swagger, co test co ban.
- Tuan 16 neu co frontend va deploy public.

Moc nen dat truoc khi phong van:

- Co GitHub repo sach.
- Co README tot.
- Co link demo.
- Co ERD.
- Co Postman collection hoac Swagger.
- Giai thich duoc DB-first, JWT, transaction checkout, inventory, role admin/customer.

Ket luan: voi nen tang hien tai, muc tieu thuc te nhat la **16 tuan de co project ung tuyen**, va **24 tuan de co project portfolio manh**.

