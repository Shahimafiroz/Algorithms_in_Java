package Object_classes_Constructors.Copy_Constructor;

 class Copy_Constructor {
  private double aa = 10.93;
  private double bb = 12.10;
   private double cc = 343.9;

   private double sum;



     // Constructor with parameters
    public Copy_Constructor(double a , double b , double c){
         aa = a;
         bb = b;
         cc = c;

        sum =aa +bb+cc;



    }

    //Copy constructor
     public Copy_Constructor(Copy_Constructor other) {
         this.aa = other.aa;
         this.bb = other.bb;
         this.cc = other.cc;

         this.sum = other.sum;

     }

     public double getSum() {
         return sum;
     }


 }

/// incomplete  im not understanding