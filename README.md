# ☁️ Cloud-Native Document Processor

An enterprise utility service designed to handle large-scale file uploads and metadata management using a Cloud-Native approach.

### 🌟 Key Features:
- **AWS S3 Integration:** Decouples file storage from the application server, allowing for infinite horizontal scaling.
- **Relational Metadata:** Stores searchable file attributes (size, type, owner) in **MySQL** for quick querying.
- **Multipart Processing:** Optimized handling of `MultipartFile` streams to minimize memory footprint during upload.

### 🛠 Tech Stack:
- Java 21, Spring Boot 3.3, AWS SDK v2, MySQL, Hibernate.

### 🔌 API Endpoints:
- `POST /api/v1/documents/upload` - Securely uploads a file to S3 and returns the metadata.
