Item = [
  "iron_saw",
  "copper_saw",
  "hand_saw",
  "copper_shears",
  "honey_tea",
  "honey_wine",
  "hot_water",
  "distilled_water",
  "easy_alcohol",
  "alcohol_premix",
  "alcohol",
  "vodka",
  "easy_bandage",
  "bandage"
        ]

for NameHelper in Item:
    Icon = '''
    {
      "parent": "item/generated",
      "textures": {
        "layer0": "with_fire:item/%s"
      }
    }
    '''%NameHelper

    with open('./%s.json'%NameHelper, 'w') as json:
        json.write(Icon)

