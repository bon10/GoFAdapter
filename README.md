# ゲームボーイを題材にしたGoFのAdapterパターンサンプル。

それぞれのゲーム機はそれぞれの専用のゲームカードリッジが存在する。  
そのため、ゲームボーイのゲームをゲームボーイアドバンスでプレイするには、  
ゲームボーイアドバンスにゲームボーイ用カセットを挿入できるようにするためのアダプターが必要になる。  
→Adapter

ゲームボーイアドバンスはゲームボーイの仕様を全く考慮していないので、  
アダプター上にゲームボーイの仕様を取り込む事が必要になる。  
→移譲

概念的にはそんな感じ。ｳﾎﾞﾎﾞ

学習元サイト：[http://www.techscore.com/tech/DesignPattern/Adapter/Adapter1.html/](http://www.techscore.com/tech/DesignPattern/Adapter/Adapter1.html/)
