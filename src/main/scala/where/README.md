# 検索条件をどこに書くか
## 前提
+ `domain/`に業務ロジックを書く
+ `repository`は interface を`domain/`に、implement を別のパッケージにする
+ `domain/`から外のパッケージへの矢印は絶対に引いては行けない

## 業務ロジックの場合
+ [doc](./$1_business_logic)

## システムロジックの場合
+ [doc](./$2_system_logic)
