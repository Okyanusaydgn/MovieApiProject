# Film Yönetim Sistemi
Merhaba! Bu proje, Java Spring Boot ve PostgreSQL kullanarak geliştirdiğimiz bir Film Yönetim Sistemi. Bu sistemde, aktörler ve onların yer aldığı filmleri yönetebilirsiniz. Film bilgilerini ekleyebilir, silebilir, güncelleyebilir ve listeleyebilirsiniz. Backend kısmı tamamen Java ile yazıldı ve veritabanı olarak PostgreSQL kullanıldı.

## 📌 Projenin Özeti
Bu proje, aktörler ve onların yer aldığı filmler arasındaki ilişkileri yönetmeyi amaçlayan bir sistemdir. Kullanıcılar, aktör ekleme, silme, güncelleme ve listeleme işlemlerini gerçekleştirebilir. Ayrıca, her aktörün yer aldığı filmler de yönetilebilir. Projenin amacı, film bilgilerini ve aktör ilişkilerini kolayca yönetebilmeyi sağlamaktır.

## Neler Kullandık?
Java 17: Ana dil olarak kullandık.
Spring Boot: Backend kısmını hızlıca geliştirebilmek için tercih ettik.
PostgreSQL: Veritabanı olarak kullandık, çünkü sağlam ve ölçeklenebilir.
pgAdmin: PostgreSQL veritabanını yönetmek için kullandık.
Postman: API’yi test etmek için kullanıldı. Postman linkini aşağıda bulabilirsiniz.
IntelliJ IDEA: Kod geliştirme sırasında tercih ettiğimiz IDE.

## Nasıl Çalıştırırsınız?

Projeyi çalıştırmak için şu adımları izleyebilirsiniz:

1. PostgreSQL indirip kurun (eğer kurulu değilse). [PostgreSQL İndirme Linki](https://www.postgresql.org/download/).
2. PostgreSQL kurulumundan sonra, pgAdmin aracıyla yeni bir veritabanı oluşturun: `film_management`.
3. Projeyi klonlayın:
   ```bash
   git clone https://github.com/your_username/film-management-system.git

4. Projeyi IntelliJ IDEA veya tercih ettiğiniz bir IDE ile açın.
5. application.properties dosyasındaki veritabanı bağlantı bilgilerini düzenleyin (PostgreSQL bağlantısı).
   Örneğin:
   
   ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/film_management
    spring.datasource.username=your_postgres_username
    spring.datasource.password=your_postgres_password

7. Spring Boot projesini başlatın.

## 📡 API Endpoint'leri
## API Endpoint'leri

Aşağıda birkaç endpoint paylaşıyorum. Bu endpoint'ler üzerinden aktörleri ve filmleri yönetebilirsiniz.

| HTTP Metodu | URL                | Ne Yapar                |
|-------------|--------------------|-------------------------|
| GET         | `/api/actor`       | Tüm aktörleri listeler  |
| POST        | `/api/actor`       | Yeni aktör ekler        |
| PUT         | `/api/actor/{id}`  | Aktör bilgisini günceller |
| DELETE      | `/api/actor/{id}`  | Aktörü siler            |
| GET         | `/api/movie`       | Tüm filmleri listeler   |
| POST        | `/api/movie`       | Yeni film ekler         |
| PUT         | `/api/movie/{id}`  | Film bilgisini günceller |
| DELETE      | `/api/movie/{id}`  | Filmi siler             |

---

## 📄 Örnek İstekler

### GET `/api/actor`

Bu istek, veritabanındaki tüm aktörleri listeleyecektir. Örneğin, Postman ile basit bir GET isteği gönderebilirsiniz.

---

### POST `/api/actor`

Yeni bir aktör eklemek için bu endpoint'i kullanabilirsiniz. Gövde (Body) kısmına aşağıdaki JSON verisini ekleyerek yeni bir aktör ekleyebilirsiniz:

```json
{
  "name": "Leonardo DiCaprio",
  "age": 48,
  "gender": "Male"
}
```
### PUT /api/actor/{id}

Mevcut bir aktörün bilgilerini güncellemek için bu endpoint'i kullanabilirsiniz. Örneğin, id değeri 1 olan bir aktörün bilgilerini güncellemek için şu formatta bir PUT isteği yapmalısınız:
```json

{
  "name": "Brad Pitt",
  "age": 60,
  "gender": "Male"
}

```

###  DELETE /api/movie/{id}

Bir filmi silmek için bu endpoint'i kullanabilirsiniz. Örneğin, id değeri 2 olan bir filmi silmek için şu şekilde bir DELETE isteği gönderebilirsiniz:

 ```bash
 api/movie/2
```

### 🤝 Katkıda Bulunma
Bu projeye katkıda bulunmak isterseniz, lütfen önce bir sorun açarak veya benimle iletişime geçerek fikirlerinizi paylaşın! Her türlü katkı için açığım. Ayrıca, pull request’ler de memnuniyetle karşılanır.

### 📧 İletişim  
Sorularınız veya önerileriniz için benimle iletişime geçebilirsiniz:  

- **E-posta:** [okyanusaydgn@gmail.com](mailto:okyanusaydgn@gmail.com)  
- **GitHub:** [Okyanusaydgn](https://github.com/Okyanusaydgn)  
