public abstract class _213_Toy {
    int price;
    public static void toy(){

    }
    final  String getToy() {
        return "toy";
        //      }

        //   public  void printToy();


    }}
//Birkaç neden: statik yöntemin, soyut sınıfın parçası olsalar bile bir gövdeye
// sahip olması gerekir, çünkü statik yöntemine erişmek için bir sınıfın örneğini
// oluşturmaya gerek yoktur. Bunu düşünmenin başka bir yolu, bir an için izin
// verildiğini varsayarsak, sorun statik yöntem çağrılarının herhangi bir
// Çalışma Süresi Türü Bilgisi (RTTI) sağlamaması, herhangi bir örnek
// oluşturmanın gerekli olmadığını hatırlamamızdır, bu nedenle yeniden
// yönlendirilemezler. onların özel geçersiz kılma uygulamaları ve dolayısıyla
// abstarct static'e izin verilmesi hiç mantıklı değil.
// Başka bir deyişle, herhangi bir polimorfizm faydası sağlayamadığı için
// izin verilmiyor.

//Few reasons: static method must have a body even if they are part
// of abstract class because one doesn't need to create instance of
// a class to access its static method. Another way to think about it is
// if for a moment we assume it is allowed then the problem is that
// static method calls don't provide any Run Time Type Information (RTTI)
// , remember no instance creation is required, thus they can't redirected to
// their specific overriden implementations and thus allowing abstarct static
// makes no sense at all.
// In other words, it couldn't provides any polymorphism benefit thus not allowed.
