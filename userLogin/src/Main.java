import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String  change ="", userName, wrongPassword ="", password, userNameData = "patika", passwordData = "java123";
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen Kullanıcı Adını Giriniz : ");
		userName = input.next();
		System.out.print("Lütfen Şifrenizi Giriniz : ");
		password = input.next();
		
		if (password != passwordData) {
			wrongPassword = password;
			}
		
		if (userName.equals(userNameData) && password.equals(passwordData)) {
			System.out.println("Giriş Yaptınız.");
		}else{
			System.out.println("Bilgileriniz Yanlış.");
			System.out.print("Şifrenizi Değiştirmek İster Misiniz (Evet / Hayır) ? : ");
			change = input.next();
			}
		
		 
		if(change.toLowerCase().equals("evet")) {
			 System.out.print("Kullanıcı Adını Giriniz : ");
			 userName = input.next();
			 if(userName.equals(userNameData)){ 
			 System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
			 password = input.next();
			 	if(password.equals(passwordData) || password.equals(wrongPassword)) {
			 		System.out.println("Yeni Şifre oluşturulamadı.(Eski Şifre veya Hatalı Şifre ile Aynı)");
			 	}else {
			 		System.out.println("Yeni Şifre oluşturuldu");
			 		passwordData=password;
			 		System.out.print("Lütfen Kullanıcı Adını Giriniz : ");
					userName = input.next();
					System.out.print("Lütfen Şifrenizi Giriniz : ");
					password = input.next();
					change = "";
						
					if (userName.equals(userNameData) && password.equals(passwordData)) {
							System.out.println("Giriş Yaptınız.");
			 		}else {
			 			System.out.print("Giriş Yapılamadı.");
			 		}
			 }
			
			 }else {
				 System.out.print("Şifre Değiştirilemedi. ");
			}
		 }if(change.toLowerCase() != "evet" && change.toLowerCase() !=""){
			
			 }
	}
}