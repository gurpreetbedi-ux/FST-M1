import pandas as pd
df = pd.read_excel("Activity19_Output.xlsx")
rows, cols = df.shape
print(f"Number of rows: {rows}")
print(f"Number of columns: {cols}")
print("\nEmail column data:")
print(df["Email"])
sorted_df = df.sort_values(by="FirstName", ascending=True)
print("\nData sorted by FirstName:")
print(sorted_df)











