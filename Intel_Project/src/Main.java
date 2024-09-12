from faker import Faker
import random

# Initialize Faker instance
        fake = Faker()

def generate_sales_transactions():
        return {
        "transactionId": fake.uuid4(),
        "productId": random.choice(['product1', 'product2', 'product3', 'product4', 'product5', 'product6'])
    }

            # Example usage
transaction = generate_sales_transactions()
print(transaction)

//from faker import Faker
//import random;
////from confluent_kafka import SerializingProducer
//
//fake=Faker()
//
//def generate_sales_transactions():
//    user = fake.simple_profile()
//    return {
//        "transactionId" : fake.uuid4(),
//        "productId"     : random.choice(['product1'],['product2'],['product3'],['product4'],['product5'],['product6'])
//            }