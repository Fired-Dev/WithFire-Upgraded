Logs = [
    "crimson_stem",
    "warped_stem",
    "oak_log",
    "spruce_log",
    "birch_log",
    "jungle_log",
    "acacia_log",
    "dark_oak_log"
    ]

planks = [
    "crimson_planks", 
    "warped_planks",
    "oak_planks",
    "spruce_planks",
    "birch_planks",
    "jungle_planks",
    "acacia_planks",
    "dark_oak_planks",
        ]
for getLogs, getPlanks in zip(Logs, planks):
    Icon = '''
{
  "type": "minecraft:crafting_shapeless",
  "ingredients": [
    {
        "item": "minecraft:%s"
    },
    {
        "tag": "forge:saw"
    }
  ],
  "result": {
    "item": "minecraft:%s",
    "count": 6
  }
}
    '''%(getLogs,getPlanks)
    with open('./%s.json'%getLogs, 'w') as json:
        json.write(Icon)