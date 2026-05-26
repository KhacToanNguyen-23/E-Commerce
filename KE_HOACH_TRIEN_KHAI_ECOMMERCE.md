# Ke hoach trien khai shop quan ao e-commerce

Ngay cap nhat: 2026-05-23

## 1. Danh gia tien do hien tai

Project hien tai dang o giai doan **backend skeleton / modular foundation**. Nen tang Spring Boot da co, cau truc module da tach theo business feature, va build hien tai pass `mvnw test`.

Da co:

- Backend Spring Boot 3.2.5, Java 17, Maven.
- Spring Web, Spring Data JPA, Spring Security, JWT, MySQL, Lombok, MapStruct.
- Cau truc modular monolith theo module: user, admin, category, product, cart, order, payment, shipping, inventory, media, promotion, review, wishlist, notification, audit.
- Entity/DTO/Repository/Mapper/Service/Controller da duoc tao cho nhieu module.
- JWT security filter, token provider, user principal, custom user details service.
- Global exception handler co trong project.
- Database local MySQL cau hinh trong `application.properties`.
- `db.sql` da co de khoi tao schema/du lieu.

Chua hoan thien:

- Nhieu service dang tra `null` hoac `List.of()`, chua co business logic that.
- Nhieu controller chua expose API hoac code dang comment.
- AuthController va IAuthService dang rong, nen login/register JWT chua thanh luong chay hoan chinh.
- Product/Category API chua dung duong dan thong nhat voi security config.
- Cart va Order moi co entity, chua co controller/service/repository hoan chinh.
- Chua co flow checkout, tru ton kho, tao don hang, tinh phi ship, ap ma giam gia.
- Chua co migration DB chuan nhu Flyway/Liquibase.
- Chua co Swagger/OpenAPI.
- Chua co validation request bang Jakarta Validation.
- Chua co test service/controller/API integration dung nghia.
- Chua co frontend.
- Chua co Dockerfile, docker-compose, CI/CD, profile deploy.
- Dang hard-code DB password va JWT secret trong source, can chuyen sang environment variables.

Ket luan: tien do backend dat khoang **25-35% neu tinh theo san pham e-commerce day du**, nhung phan nen tang project da dung huong. Viec tiep theo nen uu tien lam chay tron vong lap: product listing -> cart -> checkout -> order -> admin quan ly.

## 2. Muc tieu san pham

Xay dung shop quan ao e-commerce co 3 nhom nguoi dung:

- Guest: xem san pham, search/filter, xem chi tiet, dang ky/dang nhap.
- Customer: quan ly tai khoan, gio hang, wishlist, dat hang, thanh toan, theo doi don, review.
- Admin/Staff: quan ly san pham, bien the size/mau, ton kho, don hang, khuyen mai, media, user, bao cao.

## 3. Kien truc de xuat

Backend:

- Spring Boot 3.x, Java 17.
- Modular monolith theo package-by-feature nhu hien tai.
- REST API JSON.
- Spring Security + JWT access token.
- MySQL local khi dev.
- PostgreSQL tren cloud free-tier khi deploy, neu can don gian hoa hosting.
- Flyway cho migration DB.
- Swagger/OpenAPI cho tai lieu API.
- Docker de deploy backend on-demand.

Frontend:

- React + TypeScript + Vite.
- Tailwind CSS hoac shadcn/ui neu muon giao dien admin nhanh va dong nhat.
- TanStack Query cho API state.
- React Hook Form + Zod cho form validation.
- Zustand hoac Redux Toolkit cho cart/auth local state.
- Axios/fetch client co interceptor gan JWT.

Deploy free-tier:

- Frontend: Vercel Hobby hoac Cloudflare Pages.
- Backend: Render Free Web Service hoac Koyeb Free Web Service.
- Database: Neon Postgres Free.
- Image storage: Cloudinary Free hoac upload anh qua URL truoc, de giam scope MVP.

Ghi chu: free-tier co gioi han, co the sleep/cold start, khong phu hop production co doanh thu that. Muc tieu cua no la demo, portfolio, MVP traffic thap.

## 4. Roadmap backend

### Phase 1: Don dep nen tang backend

- Chuan hoa package name ve lowercase neu co the: `com.fptu.ecommerce`.
- Xoa hoac hop nhat duplicate exception handler.
- Sua encoding comment/README dang bi loi ky tu.
- Chuyen secret/config ra environment variables:
  - `DB_URL`
  - `DB_USERNAME`
  - `DB_PASSWORD`
  - `JWT_SECRET`
  - `JWT_EXPIRATION`
- Them profile:
  - `application-dev.properties`
  - `application-prod.properties`
  - `application-test.properties`
- Them `spring.jpa.open-in-view=false`.
- Chuyen `ddl-auto=update` sang Flyway migration cho moi truong prod.
- Them response chuan:
  - `ApiResponse<T>`
  - `PageResponse<T>`
  - error response co `timestamp`, `status`, `message`, `path`.

### Phase 2: Auth va user

Can lam:

- Register customer.
- Login bang username/email + password.
- Tra ve JWT access token.
- Password hash bang BCrypt.
- Role: `CUSTOMER`, `ADMIN`, `STAFF`.
- Endpoint `GET /api/users/me`.
- Update profile.
- Doi mat khau.
- Admin list/search/lock user.

API de xuat:

- `POST /api/auth/register`
- `POST /api/auth/login`
- `GET /api/users/me`
- `PUT /api/users/me`
- `PUT /api/users/me/password`
- `GET /api/admin/users`
- `PATCH /api/admin/users/{id}/status`

### Phase 3: Catalog san pham quan ao

Can thiet ke san pham theo dac thu quan ao: mot product co nhieu bien the size/mau.

Entity de xuat:

- `Product`: ten, slug, mo ta, gia goc, gia ban, status, brand, category.
- `ProductVariant`: product, size, color, sku, priceOverride, stockQuantity.
- `Category`: ten, slug, parent.
- `ProductImage`: product, variant optional, url, alt, sortOrder.
- `InventoryTransaction`: variant, quantityChange, reason, reference.

Tinh nang:

- CRUD category.
- CRUD product.
- CRUD variant size/mau.
- Upload/gan anh san pham.
- Search theo ten.
- Filter category, size, color, price range, status.
- Sort newest, price asc/desc, best seller.
- Pagination.
- Slug unique.

API public:

- `GET /api/products`
- `GET /api/products/{slug}`
- `GET /api/categories`
- `GET /api/products/search?keyword=...`

API admin:

- `POST /api/admin/products`
- `PUT /api/admin/products/{id}`
- `DELETE /api/admin/products/{id}`
- `POST /api/admin/products/{id}/variants`
- `PUT /api/admin/variants/{id}`
- `POST /api/admin/products/{id}/images`

### Phase 4: Cart va wishlist

Can lam:

- Moi customer co cart rieng.
- Add variant vao cart, khong add product chung chung.
- Update quantity.
- Remove item.
- Clear cart.
- Validate ton kho khi add/update.
- Wishlist add/remove/list.

API:

- `GET /api/cart`
- `POST /api/cart/items`
- `PUT /api/cart/items/{itemId}`
- `DELETE /api/cart/items/{itemId}`
- `DELETE /api/cart`
- `GET /api/wishlist`
- `POST /api/wishlist/{productId}`
- `DELETE /api/wishlist/{productId}`

### Phase 5: Promotion va pricing

Can lam:

- Coupon theo code.
- Discount percent/fixed amount.
- Thoi gian bat dau/ket thuc.
- So lan su dung toi da.
- Gia tri don hang toi thieu.
- Ap dung theo category/product neu can.

API:

- `POST /api/cart/apply-coupon`
- `DELETE /api/cart/coupon`
- `GET /api/admin/promotions`
- `POST /api/admin/promotions`
- `PUT /api/admin/promotions/{id}`

### Phase 6: Checkout va order

Can lam:

- Tao order tu cart.
- Snapshot gia, ten san pham, size, mau tai thoi diem dat.
- Dia chi giao hang.
- Phi ship.
- Trang thai order:
  - `PENDING_PAYMENT`
  - `PAID`
  - `PROCESSING`
  - `SHIPPED`
  - `DELIVERED`
  - `CANCELLED`
  - `REFUNDED`
- Tru ton kho an toan trong transaction.
- Khong cho oversell.
- Customer xem lich su don.
- Admin cap nhat trang thai don.

API:

- `POST /api/checkout`
- `GET /api/orders`
- `GET /api/orders/{id}`
- `POST /api/orders/{id}/cancel`
- `GET /api/admin/orders`
- `PATCH /api/admin/orders/{id}/status`

### Phase 7: Payment va shipping

MVP nen lam COD truoc de nhanh co demo.

Payment:

- COD.
- Bank transfer manual.
- Sau MVP co the them VNPay/Momo/Stripe tuy muc tieu.

Shipping:

- Dia chi customer.
- Phi ship mac dinh theo tinh/thanh hoac flat rate.
- Ma van don thu cong cho admin.
- Trang thai shipping.

API:

- `POST /api/payments/cod`
- `POST /api/payments/bank-transfer`
- `GET /api/shipping/rates`
- `PATCH /api/admin/orders/{id}/tracking`

### Phase 8: Review, notification, audit

Review:

- Chi cho review neu da mua va order delivered.
- Rating 1-5.
- Comment, image optional.
- Admin an review xau/spam.

Notification:

- Thong bao dat hang thanh cong.
- Thong bao doi trang thai don.
- Email qua Resend/Brevo free-tier neu can.

Audit:

- Ghi log admin action: create/update/delete product, update order status, lock user.

### Phase 9: Test va quality

Can them:

- Unit test service.
- Controller test voi MockMvc.
- Integration test repository voi Testcontainers hoac H2 profile test.
- Test auth/security.
- Test checkout transaction va stock.
- Test mapper.
- Test validation.

Lenh can pass truoc moi lan merge:

```bash
cd backend
./mvnw test
./mvnw clean package
```

## 5. Roadmap frontend

### Phase 1: Khoi tao frontend

Tao folder `frontend`:

```bash
npm create vite@latest frontend -- --template react-ts
cd frontend
npm install
npm install @tanstack/react-query axios react-router-dom react-hook-form zod zustand
```

Cau truc de xuat:

```text
frontend/src
  app
  components
  features
    auth
    products
    cart
    checkout
    orders
    admin
  lib
    api
    auth
    validators
  pages
  routes
```

### Phase 2: Customer storefront

Trang can co:

- Home: banner, category, san pham moi, san pham noi bat.
- Product listing: filter category, size, color, price, sort, pagination.
- Product detail: anh, size, mau, ton kho, so luong, add cart, add wishlist.
- Cart page: update quantity, remove item, subtotal.
- Checkout page: dia chi, shipping, coupon, payment method.
- Order success.
- Login/register.
- Profile.
- My orders.
- Order detail.
- Wishlist.

### Phase 3: Admin dashboard

Trang can co:

- Dashboard tong quan doanh thu, order moi, san pham sap het hang.
- Product management.
- Category management.
- Variant/stock management.
- Order management.
- Promotion management.
- User management.
- Review moderation.
- Media management.

### Phase 4: Frontend technical checklist

- Auth token luu trong memory + localStorage hoac cookie tuy backend.
- Route guard cho customer/admin.
- API error handling thong nhat.
- Loading skeleton.
- Empty states.
- Toast notification.
- Form validation.
- Responsive mobile.
- SEO co ban: title, description, product slug.

## 6. Database model nen co

Bang cot loi:

- users
- roles hoac role enum trong users
- categories
- products
- product_variants
- product_images
- carts
- cart_items
- wishlists
- orders
- order_items
- payments
- shippings
- promotions
- promotion_usages
- reviews
- notifications
- inventory_transactions
- audit_logs

Index nen co:

- `users.email`
- `users.username`
- `products.slug`
- `products.name`
- `categories.slug`
- `product_variants.sku`
- `orders.user_id`
- `orders.status`
- `orders.created_at`

## 7. Deploy free-tier

### Phuong an khuyen nghi cho demo

- Frontend: Vercel Hobby hoac Cloudflare Pages.
- Backend: Render Free Web Service.
- Database: Neon Postgres Free.
- Image: Cloudinary Free.

Ly do:

- Frontend static deploy rat de.
- Backend Spring Boot co the deploy bang Docker/JAR tren Render.
- Neon Postgres free phu hop demo va co connection string don gian.
- Tach DB ra Postgres giup deploy free de hon MySQL.

### Can sua backend truoc khi deploy

- Doi MySQL sang Postgres cho prod:
  - Them dependency PostgreSQL JDBC.
  - Cau hinh datasource bang env var.
  - Kiem tra lai SQL dialect va entity.
- Them Dockerfile trong `backend`.
- Them endpoint health:
  - `GET /actuator/health`
- Them dependency actuator.
- Them CORS cho domain frontend.
- Tao migration Flyway thay cho `ddl-auto=update`.
- Tat show SQL o prod.

### Dockerfile backend de xuat

```dockerfile
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### Bien moi truong backend prod

```text
SPRING_PROFILES_ACTIVE=prod
DB_URL=jdbc:postgresql://<host>/<database>?sslmode=require
DB_USERNAME=<username>
DB_PASSWORD=<password>
JWT_SECRET=<long-random-secret-at-least-32-chars>
JWT_EXPIRATION=86400000
FRONTEND_URL=https://<your-frontend-domain>
```

### Deploy backend len Render

1. Push code len GitHub.
2. Tao Neon Postgres database, copy connection string.
3. Tao Render Web Service tu GitHub repo.
4. Root directory: `backend`.
5. Chon Docker deploy neu co Dockerfile.
6. Set env vars nhu tren.
7. Deploy.
8. Kiem tra:
   - `/actuator/health`
   - Swagger URL neu da them.
   - Login/register API.

Luu y: Render Free Web Service co ephemeral filesystem va co gioi han free-tier. Khong luu file upload truc tiep tren disk backend.

### Deploy frontend len Vercel

1. Tao project tu GitHub.
2. Root directory: `frontend`.
3. Build command: `npm run build`.
4. Output directory: `dist`.
5. Set env:

```text
VITE_API_BASE_URL=https://<backend-render-url>
```

6. Deploy.
7. Set CORS backend cho domain Vercel.

### Deploy frontend len Cloudflare Pages

1. Connect GitHub repo.
2. Root directory: `frontend`.
3. Build command: `npm run build`.
4. Output directory: `dist`.
5. Set env `VITE_API_BASE_URL`.

## 8. Thu tu trien khai thuc te nen lam

1. Hoan thien auth: register/login/me/role.
2. Hoan thien category CRUD.
3. Hoan thien product + variant + image + inventory.
4. Hoan thien public product listing/detail/search/filter.
5. Hoan thien cart.
6. Hoan thien checkout COD va order.
7. Hoan thien admin order/product.
8. Them Swagger va validation.
9. Them Flyway migration.
10. Tao frontend customer.
11. Tao frontend admin.
12. Them Dockerfile va deploy backend.
13. Deploy frontend.
14. Test end-to-end tren URL deploy.

## 9. Definition of Done cho MVP

MVP du dieu kien demo khi:

- User dang ky, dang nhap, logout duoc.
- Guest xem danh sach san pham va chi tiet san pham.
- Customer them san pham bien the size/mau vao gio hang.
- Customer checkout COD thanh cong.
- He thong tao order va tru ton kho.
- Customer xem lich su don.
- Admin tao/sua/an san pham.
- Admin cap nhat trang thai don.
- Frontend customer va admin dung duoc tren mobile/desktop.
- Backend va frontend da deploy len URL public.
- Khong con secret hard-code trong source.
- `mvnw test` pass.

## 10. Nguon tham khao free-tier da kiem tra

- Render Free Web Services: https://render.com/free
- Koyeb Free Service: https://www.koyeb.com/docs
- Neon Free Postgres: https://neon.com/pricing
- Vercel Hobby Plan: https://vercel.com/docs/accounts/plans/hobby
- Cloudflare Pages limits: https://developers.cloudflare.com/pages/platform/limits/

