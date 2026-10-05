# MathUtil JUnit & CI/CD Project

Dự án kiểm thử đơn vị (Unit Test) cho lớp `MathUtil` sử dụng **JUnit 5**, **Maven**, **JaCoCo** và **GitHub Actions (CI)**.

## 🚀 Trạng Thái Tích Hợp Liên Tục (CI Status)
![MathUtil CI Pipeline](https://github.com/<USERNAME>/<REPOSITORY>/actions/workflows/ci.yml/badge.svg)

## 🛠 Công Nghệ Sử Dụng
- **Java 21**
- **JUnit 5 (Jupiter)** - Framework Unit Test
- **Maven** - Công cụ quản lý dự án & dependencies
- **JaCoCo Plugin** - Đo độ bao phủ mã nguồn (Code Coverage)
- **GitHub Actions** - Continuous Integration (CI)

## 💻 Hướng Dẫn Chạy Test Lập Trình Viên (Local)

Chạy tất cả các test case và xuất báo cáo:
```bash
mvn clean test
```

Xem báo cáo độ bao phủ mã nguồn (Code Coverage):
Mở file `target/site/jacoco/index.html` bằng trình duyệt web.
