# 検索条件をどこに書くか
## 前提
+ `domain/`に業務ロジックを書く
  + 業務ロジックとはサービス仕様に基づいて決まるもの
+ `domain/`から外のパッケージへの矢印は絶対に引いては行けない
+ `repository`は interface を`domain/`に置き、implement を別のパッケージに置く

## 業務ロジックの場合
+ [doc](./$1_business_logic)

## システムロジックの場合
+ [doc](./$2_system_logic)
