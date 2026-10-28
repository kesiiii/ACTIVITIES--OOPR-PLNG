print("~~~~~~~~~~~~~PROGRAM 1~~~~~~~~~~~~~")
print()
class Book: #parent class
  
  def __init__(self, title, author, price): # the constructor method
    #save as variable
    self.title = title
    self.author = author
    self.price = price

  def __str__(self): #special method to define how the object display
    return (
        f"Book: {self.title}\n"
        f"Author: {self.author}\n"
        f"Price: PHP {self.price:.2f}"
    )


class EBook(Book): #child class that inherit the parent
  #the constructing method adding a new parameter
  def __init__(self, title, author, price, file_size_mb):
    super().__init__(title, author, price) #send to parent class constructor
    self.file_size_mb = file_size_mb

  #override the print string format for electronic products
  def __str__(self):
    return f"{super().__str__()}\nFile Size: {self.file_size_mb} MB"


def main():
  books = [
      Book("Python Basics", "Maria Santos", 450),
      EBook("Learning OOP", "Ana Cruz", 300, 15),  
  ]

  for book in books:
    print(book)
    print()


if __name__ == "__main__":
  main()

print()
print("~~~~~~~~~~~~~PROGRAM 4~~~~~~~~~~~~~")
print()

class Product: #parent class
    def __init__(self, product_name, price): # the constructor method
    #save as variable
        self.product_name = product_name
        self.price = price

    def __str__(self):
      #special method to define how the object display
        return f"Product: {self.product_name}\nPrice: PHP {self.price:.2f}"

class ElectronicProduct(Product): #child class that inherit the parent
    def __init__(self, product_name, price, warranty_months):
        super().__init__(product_name, price)
        self.warranty_months = warranty_months

     #override the print string format for electronic products
    def __str__(self):
        return f"{super().__str__()}\nWarranty: {self.warranty_months} months"

#define laptop that inherits from electronic product
class Laptop(ElectronicProduct):
  # the constructing method specification for ram and storage
    def __init__(self, product_name, price, warranty_months, ram_gb, storage_gb):
        super().__init__(product_name, price, warranty_months)
        self.ram_gb = ram_gb
        self.storage_gb = storage_gb

  #override the string format for the laptop 
    def __str__(self):
        return f"{super().__str__()}\nRAM: {self.ram_gb} GB\nStorage: {self.storage_gb} GB"


def main(): #define the main executions
    laptop1 = Laptop("Lenovo Laptop", 35000.00, 24, 16, 512)
    laptop2 = Laptop("Predator Gaming Laptop", 75000.00, 12, 32, 1024)

  #display the product
    print(laptop1)
    print()  
    print(laptop2)

# Trigger the main execution block
if __name__ == "__main__":
    main()