import pandas as pd

df = pd.read_csv("Activity17_Output.csv")

print("Usernames column:")
print(df["Usernames"])
print("\nData from the second row:")
print(df.iloc[1])  
print("\nData sorted by Usernames (ascending):")
print(df.sort_values(by="Usernames", ascending=True))
print("\nData sorted by Passwords (descending):")
print(df.sort_values(by="Passwords", ascending=False))
