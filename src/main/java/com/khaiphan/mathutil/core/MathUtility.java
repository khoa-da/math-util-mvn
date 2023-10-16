package com.khaiphan.mathutil.core;

//class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho
//các nơi khác
//cái gì mà dùng chung cho nhiều nơi, nhận info,trả về về info qua
//hàm, mà ko cần lưu trữ gì hết, cái đó nên là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS.
//KO BH GỌI STATIC QUA CON ĐƯỜNG NEW!!!!!!!
public class MathUtility {
    public static final double PI = 3.14;
    //C: public const double Pi = 3.14 //ko cần chữ static mà vẫn là 
                                        //static nếu có từ khóa const
                                        //const C# ~ final java
    
    //hàm tính n! = 1.2.3...n
    //KO CÓ GIAI THỪA CỦA SỐ ÂM, N < 0 KO TÍNH ĐC
    //NẾU N QUÁ LỚN THÌ TRÀN KIỂU LONG, LONG CHỈ CHỊU ĐC 18 SỐ 0
    //20! VƯAD ĐỦ 18 SỐ 0, DO ĐÓ: KO TÍNH GIẢI THỪA TỪ 21 TRỞ ĐI
    //0! = 1! = - QUY ƯỚC
    public static long getFactorial(int n) {
        
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if(n == 0 || n == 1)
            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay
        return n * getFactorial(n-1);
       
    }
    //đệ quy  - recursion
    //5! = 1.2.3.4  .5
    //5! = 4! .5 = 5. 4!
    //4! = 3! .4 = 4. 3!
    //3! =       = 3. 2!
    //2!=        = 2. 1!    DỪNG
    
    //n! = n. (n-1)! 
    
    
    
    
    //kĩ thuật kiểm thử hồi quy - regression
    //test lại những thứ đã từng test để xác nhận nó còn có ổn k
    //tại sao phải test lại??
    //code theo thời gian sẽ có thay đổi, thay đổi vì
    //1. ae fix bug, sẽ sửa lại code
    //2. anh em tối ưu, chỉnh sửa code để code đẹp hơn, chạy tốt hơn, nhanh hơn
    //3. ae thêm hàm mới, method mới 
    
    //khi sửa code, aae phải test lại, để đảm bảo nó vẫn ngon, vẫn xanh 
    //nếu test bằng tay thì cực kì mất sức coi chugn72 sai sót,
    //mếu có test script, ta chỉ việc run, và nhìn màu đưa ra
    //nếu có màu xanh, code chỉnh sửa ổn, vì thỏa exoected == actual
    //nếu code có màu đỏ, code k ổn , sửa cho đến khi ổn 
    //ta test lại mà chỉ cna62 nhìn màu -> nhanh, k hao sức, chính xác 
    //miễn đủ testcase, test script
    
    //test lại những thứ đã từng test gọi là test hồi quy regression
    
    //dự án ttd 
//    public static long getFactorial(int n) {
//        
//        if(n<0 || n>20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
//        
//        if(n == 0 || n == 1)
//            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay
//        
//        //sống só đến chỗ này, sure n = 2..20. Vì nếu ko chết dọc đường ở
//        //2 cụm if ở trên rồi, KO CẦN ELSE NẾU TRC ĐÓ XÀI RETURN
//        long result = 10; //giai thừa khởi đầu là 1
//        //cố tình làm cho code màu đỏ, vì 2! lúc này là 20, 3! là 60
//        //nhân 10l
//        //nhân dồn 2 3 4 5 ...n n vòa biến này thì thành n! 
//        
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
