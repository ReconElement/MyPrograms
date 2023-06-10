import ssl
import smtplib
from email.message import EmailMessage
import random

subject='3 step verification'
rand_num=random.randint(100000,999999)
body="Your code is: "
body=body+str(rand_num)

em=EmailMessage()
em['From']=email_sender
em['To']=email_reciever
em['Subject']=subject
em.set_content(body)

context=ssl.create_default_context()
with smtplib.SMTP_SSL('smtp.gmail.com',465,context=context) as smtp:
    smtp.login(email_sender, email_password)
    smtp.sendmail(email_sender, email_reciever, em.as_string())
    
ch=input("Enter the code you recieved: ")
if(int(ch)==int(rand_num)):
    print("Valid code")
else:
    print("Invalid code")

